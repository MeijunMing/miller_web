package com.supermmj.www.kafka;


import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;
import kafka.serializer.StringDecoder;
import kafka.utils.VerifiableProperties;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/*******************************************************************************
 * Copyright (c) 2016 supermmj.com
 * <p>
 * All rights reserved.
 * <p>
 * Contributors:
 * Miller Ming - Initial implementation
 *******************************************************************************/
public class KafkaConsumer {

    private  ConsumerConnector connector;
    private Properties propertie;
    private String toptic;

    public KafkaConsumer(Properties propertie,String toptic){
        this.propertie = propertie;
        this.toptic=toptic;
        this.connector  = Consumer.createJavaConsumerConnector (new ConsumerConfig (this.propertie));
    }

    public ConsumerIterator<String, String> getConsumerIterator() {
        Map<String,Integer> map = new HashMap<String,Integer> ();
        map.put (this.toptic,new Integer (1));
        StringDecoder keyDecoder = new StringDecoder(new VerifiableProperties ());
        StringDecoder valueDecoder = new StringDecoder(new VerifiableProperties());
        Map<String, List<KafkaStream<String, String>>> streams = this.connector.createMessageStreams (map, keyDecoder, valueDecoder);

        KafkaStream<String, String> kafkaTopic = streams.get (this.toptic).get (0);

        return kafkaTopic.iterator ();
    }
}
