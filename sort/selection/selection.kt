fun <T : Comparable<T>> Array<T>.selection_sort() {
    for (i in 0..size - 2) {
        var k = i
        for (j in i + 1..size - 1)
            if (this[j] < this[k])
                k = j
 
        if (k != i) {
            val tmp = this[i]
            this[i] = this[k]
            this[k] = tmp
        }
    }
}