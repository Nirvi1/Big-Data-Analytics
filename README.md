# Big-Data-Analytics
Performance Analysis of Hadoop and Spark using Multinode Cluster
Abstract
Today, big data is the most interesting topic for research as well as utility in all
sectors where data can be acquired. MapReduce and Spark are two very popular open
source cluster computing frameworks for large scale data analytics. These
frameworks hide the complexity of task parallelism and fault-tolerance, by exposing
simple programming API to users. MapReduce has been extensively design for batch
processing, that is it efficiently processes chunks of static data but fails if the data is
dynamic. With most of the data being generated through social media, tools such as
Spark are required, which can process streams of data in real time for non-batch jobs
like interactive queries. In this project, we have studied the working of MapReduce
Hadoop and Spark, their differences and the reasons for these differences. To conduct
practical analysis, we have created a cluster of three nodes for both the tools and
executed WordCount and Grep to analyze performance difference of both the tools in
terms of computing time. Our results show that Spark runs the jobs faster than
Hadoop.
