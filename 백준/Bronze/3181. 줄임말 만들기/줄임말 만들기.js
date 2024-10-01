function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  const ignored = new Set([
    "i",
    "pa",
    "te",
    "ni",
    "niti",
    "a",
    "ali",
    "nego",
    "no",
    "ili",
  ]);

  input.forEach((line) => {
    const words = line.split(" ");
    let result = "";

    if (words.length > 0) {
      result += words[0].charAt(0).toUpperCase(); 
    }

    for (let i = 1; i < words.length; i++) {
      if (!ignored.has(words[i])) {
        result += words[i].charAt(0).toUpperCase(); 
      }
    }

    console.log(result); 
  });
}

main();
