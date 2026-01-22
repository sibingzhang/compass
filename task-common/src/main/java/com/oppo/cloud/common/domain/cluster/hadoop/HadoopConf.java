/*
 * Copyright 2023 OPPO.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.oppo.cloud.common.domain.cluster.hadoop;

import lombok.Data;

import java.util.List;

/**
 * hadoop:
 *   namenodes:
 *     - nameservices: logs-hdfs
 *       namenodesAddr: [ "host1", "host2" ]
 *       namenodes: [ "namenode1", "namenode2" ]
 *       user: hdfs
 *       password:
 *       port: 8020
 *       matchPathKeys: [ "flume" ]
 *
 *   yarn:
 *     - clusterName: "bigdata"
 *       resourceManager: [ "localhost:8088" ]
 *       jobHistoryServer: "localhost:19888"
 *
 *   spark:
 *     sparkHistoryServer: [ "localhost:18018" ]
 */

@Data
public class HadoopConf {

    private List<NameNodeConf> namenodes;

    private List<YarnConf> yarn;

    private SparkConf spark;
}
