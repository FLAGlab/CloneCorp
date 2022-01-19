fun insertionSort(array: IntArray) {
    for (index in 1 until array.size) {
        val value = array[index]
        var subIndex = index - 1
        while (subIndex >= 0 && array[subIndex] > value) {
            array[subIndex + 1] = array[subIndex]
            subIndex--
        }
        array[subIndex + 1] = value
    }
}