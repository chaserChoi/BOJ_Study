function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim();

    const lines = input.split("\n");
    const n = parseInt(lines[0]);
    const ans = [];

    const keypad = {
      A: "2",
      B: "2",
      C: "2",
      D: "3",
      E: "3",
      F: "3",
      G: "4",
      H: "4",
      I: "4",
      J: "5",
      K: "5",
      L: "5",
      M: "6",
      N: "6",
      O: "6",
      P: "7",
      Q: "7",
      R: "7",
      S: "7",
      T: "8",
      U: "8",
      V: "8",
      W: "9",
      X: "9",
      Y: "9",
      Z: "9",
    };

    for (let i = 1; i <= n; i++) {
      const company = lines[i].trim();

      let phoneNum = "";
      for (const c of company.toUpperCase()) {
        if (keypad[c]) 
          phoneNum += keypad[c];
      }

      const isPalindrome =
        phoneNum === phoneNum.split("").reverse().join("");
      ans.push(isPalindrome ? "YES" : "NO");
    }

    console.log(ans.join("\n"));
}

main();
