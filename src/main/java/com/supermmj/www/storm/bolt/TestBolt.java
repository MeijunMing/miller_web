package com.supermmj.www.storm.bolt;

import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Tuple;

import java.util.Map;

/*******************************************************************************
 * Copyright (c) 2016 esse.io.
 * <p>
 * All rights reserved.
 * <p>
 * Contributors:
 * Miller Ming - Initial implementation
 *******************************************************************************/
public class TestBolt extends BaseRichBolt {



    @Override
    public void prepare(Map map, TopologyContext topologyContext, OutputCollector outputCollector) {



    }

    @Override
    public void execute(Tuple tuple) {

    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {

    }
}
