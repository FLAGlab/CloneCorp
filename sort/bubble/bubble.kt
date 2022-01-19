fun bubbleSort(arr:IntArray):IntArray{
    var swap = true
    while(swap){
        swap = false
        for(i in 0 until arr.size-1){
            if(arr[i] > arr[i+1]){
                val temp = arr[i]
                arr[i] = arr[i+1]
                arr[i + 1] = temp

                swap = true
            }
        }
    }
    return arr
}

fun main(args: Array<String>) {
    val list = bubbleSort(intArrayOf(2,15,1,8,4))
    for (k in list) print("$k ")
}

class Person(val name: String, var age: Int){
    fun present() = "Holiii"
    fun greet(other: String) = "Lalalalalala"
}

class SamePerson {
    constructor(parent: Person) {
        parent.children.add(this)
    }

    fun present(){
        return "Hola"
    }
    fun greet(other:String){
        return "lalala"
    }
}