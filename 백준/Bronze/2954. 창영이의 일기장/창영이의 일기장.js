function main() {
  const input = require("fs").readFileSync("/dev/stdin").toString().trim();
  
  let decoded = "";
  const vowels = "aeiou"; 

  for (let i = 0; i < input.length; i++) {
    decoded += input[i];

    if (vowels.includes(input[i])) {
      
      if (
        i + 2 < input.length &&
        input[i + 1] === "p" &&
        input[i + 2] === input[i]
      ) {
        i += 2; 
      }
    }
  }

  console.log(decoded);
}

main();
