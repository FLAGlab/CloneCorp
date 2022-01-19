#include <algorithm>
#include <iterator>
#include <iostream>
 
template<typename ForwardIterator> void selection_sort(ForwardIterator begin,
                                                       ForwardIterator end) {
  for(auto i = begin; i != end; ++i) {
    std::iter_swap(i, std::min_element(i, end));
  }
}
 
