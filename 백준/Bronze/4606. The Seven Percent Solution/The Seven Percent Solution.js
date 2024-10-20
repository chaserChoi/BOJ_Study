function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  const arr = ["%20", "%21", "%24", "%25", "%28", "%29", "%2a"];
  const chars = [" ", "!", "$", "%", "(", ")", "*"];

  for (let s of input) {
    if (s === "#") break;

    let ans = "";

    for (let i = 0; i < s.length; i++) {
      let flag = false;

      for (let j = 0; j < chars.length; j++) {
        if (s[i] === chars[j]) {
          ans += arr[j];
          flag = true;
          break;
        }
      }

      if (!flag) ans += s[i];
    }

    console.log(ans);
  }
}

main();
