package com.newegg.ec.redis.client;

import com.newegg.ec.redis.entity.RedisNode;
import redis.clients.jedis.JedisCluster;

import java.util.List;
import java.util.Map;

/**
 * @author Jay.H.Zou
 * @date 2019/7/18
 */
public interface IRedisClusterClient extends IDatabaseCommand {

    JedisCluster getRedisClusterClient();

    Map<RedisNode, List<RedisNode>> clusterNodes() throws Exception;

    void close();
}
