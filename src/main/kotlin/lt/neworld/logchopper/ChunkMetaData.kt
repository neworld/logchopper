package lt.neworld.logchopper

import java.io.InputStream
import java.io.PipedOutputStream

data class ChunkMetaData(val name: String, val input: InputStream)
