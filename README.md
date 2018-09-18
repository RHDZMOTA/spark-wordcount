# Spark Wordcount 

This is an example of a [Spark](https://spark.apache.org/) App that executes a wordcount on 50 different books 
from [Project Gutenberg](https://www.gutenberg.org/).

## Setup

The setup is straightforward: 

1. Clone this repository: `git clone git@github.com:rhdzmota/spark-wordcount.git`
2. Enter the base directory and run the script to download the data: `bash gutenberg.sh`
    * Aprox 37K books will be downloaded (~ 14GB)
    * Expect several hours of download depending on your network speed. 

**Sample dataset**

Alternatively, you can use a sample of 50 books contained in `gutenberg-50.tar.gz`.

* Extract the contents: `tar -xzf gutenberg-50.tar.gz`
* Rename the output folder: `mv gutenberg-50 gutenberg`

## Usage

You can run the application with SBT or compile and submit a spark-job.

**Run with SBT**

Use SBT to run the Spark Application with: `sbt run`

**Compile and submit**

Compile a fatjar with `sbt assembly` and use the resulting `.jar` 
in `target/scala-2.11/spark-wordcount-assembly-0.0.0.jar` to submit the job. 

## License

See the `LICENSE.md` file.
