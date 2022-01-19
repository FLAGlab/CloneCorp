quickSort(List a) {
  if (a.length <= 1) {
    return a;
  }
 
  var pivot = a[0];
  var less = [];
  var more = [];
  var pivotList = [];
 
  // Partition
  a.forEach((var i){    
    if (i.compareTo(pivot) < 0) {
      less.add(i);
    } else if (i.compareTo(pivot) > 0) {
      more.add(i);
    } else {
      pivotList.add(i);
    }
  });
 
  // Recursively sort sublists
  less = quickSort(less);
  more = quickSort(more);
 
  // Concatenate results
  less.addAll(pivotList);
  less.addAll(more);
  return less;
}