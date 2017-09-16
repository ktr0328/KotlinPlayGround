package SequenceTest

import java.io.File

/**
 * Created by ktr on 2017/09/17.
 */
fun main(args: Array<String>) {
    File("src/SequenceTest/file.csv")
            .bufferedReader()
            .useLines {
                it.take(40)
                        .map {
                            StringBuilder().apply { (0..Integer.parseInt(it)).map { append("*") } }
                        }.forEach { println(it) }
            }

//    writeFile("src/SequenceTest/file.csv")
}

fun writeFile(path: String): Unit = File(path).absoluteFile
        .writeText(
                StringBuilder().apply {
                    (0..100).map {
                        append("$it${System.getProperty("line.separator")}")
                    }
                }.toString()
        )