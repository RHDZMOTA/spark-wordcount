# Spark Wordcount 

This is an example of a [Spark](https://spark.apache.org/) App that executes a wordcount on 50 different books 
from [Project Gutenberg](https://www.gutenberg.org/).

## Setup

The setup is straightforward: 

1. Clone this repository: `git clone git@github.com:rhdzmota/spark-wordcount.git`
2. Run the script to download the data: `bash gutenberg.sh`

Or use the  `gutenberg-50.tar.gz` for a sample of 50 books (extract the contents into a 
folder named `gutenberg`). 

## Usage

You can run the application with SBT or compile and submit a spark-job.

**Run with SBT**

Use SBT to run the Spark Application with: `sbt run`

**Compile and submit**

Compile a fatjar with `sbt assembly` and use the resulting `.jar` 
in `target/scala-2.11/spark-wordcount-assembly-0.0.0.jar` to submit the job. 


## License

See the `LICENSE.md` file.
