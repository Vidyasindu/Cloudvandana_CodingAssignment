function reverseWords(sentence) {
  let words = sentence.split(" ");
  let reversedWords = [];

  for (let word of words) {
    let stack = [];
    for (let letter of word) {
      stack.push(letter);
    }

    let reversedWord = "";
    while (stack.length > 0) {
      reversedWord += stack.pop();
    }

    reversedWords.push(reversedWord);
  }

  return reversedWords.join(" ");
}

// Example usage
let sentence = "This is a sunny day";
let reversedSentence = reverseWords(sentence);
console.log(reversedSentence);
 