List<int> mergeSort(List<int> array) {

  // Stop recursion if array contains only one element
  if(array.length <= 1) {
    return array;
  }

  // split in the middle of the array
  int splitIndex = array.length ~/ 2;

  // recursively call merge sort on left and right array
  List<int> leftArray = mergeSort(array.sublist(0, splitIndex));
  List<int> rightArray = mergeSort(array.sublist(splitIndex));

  return merge(leftArray, rightArray);
}


List<int> merge(left_array, right_array) {
  List<int> result = [];
  int i = 0;
  int j = 0;

  // Search for the smallest eleent in left and right arrays
  // array and insert it into result
  // After the loop only one array has remaining elements
  while((i < left_array.length) && (j < right_array.length)) {
    if(left_array[i] <= right_array[j]) {
      result.add(left_array[i]);
      i++;
    } else {
      result.add(right_array[j]);
      j++;
    }
  }

  // Insert remaining elements of left array into result
  // as long as there are remaining elements
  while(i < left_array.length) {
    result.add(left_array[i]);
    i++;
  }

  // Insert remaining elements of right array into result
  // as long as there are remaining elements
  while(j < right_array.length) {
    result.add(right_array[j]);
    j++;
  }

  return result;
}