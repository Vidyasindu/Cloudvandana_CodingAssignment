function sortDescending(arr) {
    arr.sort(function(a, b) {
      return b - a;
    });
    return arr;
  }
  
  // Example usage
  let numbers = [5, 2, 8, 1, 9];
  let sortedArray = sortDescending(numbers);
  console.log(sortedArray); // Output: [9, 8, 5, 2, 1]