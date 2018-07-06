val file1	=	sc.textFile("hdfs://cet4:9000/input/pg4300.txt") 
val file2	=	sc.textFile("hdfs://cet4:9000/input/pg20417.txt") 
val file3	=	sc.textFile("hdfs://cet4:9000/input/5000-8.txt") 
var ip	=	Seq(file1,file2,file3) 
var inputFile	=	sc.union(ip) 
val matchTerm : String = "Leonardo" 
val numMatches = inputFile.filter(line => line.contains(matchTerm)).counl () numMatches: Long = 627 
