function replaceDigits(numStr, toReplace, replaceWith) {
  return numStr
    .split("")
    .map((char) => {
      return char === toReplace ? replaceWith : char;
    })
    .join("");
}

function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split(" ");

  const a = input[0];
  const b = input[1];

  const minA = replaceDigits(a, "6", "5");
  const minB = replaceDigits(b, "6", "5");
  const minSum = parseInt(minA) + parseInt(minB);

  const maxA = replaceDigits(a, "5", "6");
  const maxB = replaceDigits(b, "5", "6");
  const maxSum = parseInt(maxA) + parseInt(maxB);

  console.log(minSum, maxSum);
}

main();
