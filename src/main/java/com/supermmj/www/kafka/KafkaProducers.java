package com.supermmj.www.kafka;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

import java.util.Properties;

/*******************************************************************************
 * Copyright (c) 2016 supermmj.com
 * <p>
 * All rights reserved.
 * <p>
 * Contributors:
 * Miller Ming - Initial implementation
 *******************************************************************************/
public class KafkaProducers  {

    private Integer events = 0;

    public static void main(String[] args) throws InterruptedException {
        new KafkaProducers ().producer();
    }

    public void producer() throws InterruptedException {
        Properties props = new Properties();
        props.put("zookeeper.connect", "localhost:2181");
        props.put("metadata.broker.list", "localhost:9092");
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        //props.put("partitioner.class", "com.sensedia.kafkapub.SimplePartitioner");
       // props.put("request.required.acks", "1");

        ProducerConfig config = new ProducerConfig(props);
        Producer<String, String> producer = new Producer<String, String>(config);



        while (true) {
            KeyedMessage<String, String> data = new KeyedMessage<String, String> ("testkafka", "{\n" +
                    "    \"product_reg_type\": \"02\",\n" +
                    "    \"product_name\": \"翼龙贷理财产品\",\n" +
                    "    \"product_mark\": \"obzix\",\n" +
                    "    \"source_code\": \"BJYLD20070907\",\n" +
                    "    \"source_product_code\": \"5473\",\n" +
                    "    \"plan_raise_amount\": 400000,\n" +
                    "    \"rate\": 0.09,\n" +
                    "    \"term_type\": \"天\",\n" +
                    "    \"term\": 30,\n" +
                    "    \"isshow\": 1,\n" +
                    "    \"remark\": \"lcazctrirfkzeypyrffp\",\n" +
                    "    \"amount_limmts\": 100,\n" +
                    "    \"amount_limmtl\": 400000,\n" +
                    "    \"borrowname\": \"25cb04daefe8374577fd2865d536ceb4\",\n" +
                    "    \"borrowamt\": 400000,\n" +
                    "    \"idcard\": \"3453cb0db86209eda904cd5791a6396f\",\n" +
                    "    \"begindate\": \"2016-07-27 \",\n" +
                    "    \"enddate\": \"2017-07-27 \",\n" +
                    "    \"red_rate\": 0.01,\n" +
                    "    \"source_product_url\": \"http://miizm.com/kystwkajxpkfuem.html\"\n" +
                    "  }");
            System.out.println("Enviando ...");
            producer.send(data);
            Thread.sleep (5000);
            System.out.println("Sucesso!!!");
        }
    }



}
