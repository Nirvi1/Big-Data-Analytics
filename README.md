# Big-Data-Analytics
Performance Analysis of Hadoop and Spark using Multinode Cluster
# Abstract
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

# Implemented Problems
We undertook some simple experiments for better illumination of the discussed tools.
The experiments are aimed to show the improvements of Spark compared to Hadoop. We
simply want to show that recent systems in the area of real-time and streaming big data
are more suitable than Hadoop. For the case of real-time in-memory computing, we
selected Spark. We executed simple programs WordCount and Grep, and compared the
performance results of Spark to Hadoop on multinode cluster.
WordCount counts occurrences of each word in a given text and Grep extracts matching
strings of a given pattern in a given text. WordCount is CPU intensive, but Grep is I/O
intensive if a simple pattern is being searched. We searched for simple word; hence, Grep
is totally I/O intensive here.
