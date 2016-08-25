package com.supermmj.www.storm.spout;

import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichSpout;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Values;

import java.util.Map;

/*******************************************************************************
 * Copyright (c) 2016 supermmj.com
 * <p>
 * All rights reserved.
 * <p>
 * Contributors:
 * Miller Ming - Initial implementation
 *******************************************************************************/
public class TestFieldGroupSpout extends BaseRichSpout {

    long i = 0;
    private SpoutOutputCollector spoutOutputCollector ;
    public void open(Map map, TopologyContext topologyContext, SpoutOutputCollector spoutOutputCollector) {
        this.spoutOutputCollector = spoutOutputCollector;
    }

    public void nextTuple() {
        i++;
        spoutOutputCollector.emit(new Values(i%2,i));

    }

    public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {

        outputFieldsDeclarer.declare(new Fields("flag","num"));

    }
}
