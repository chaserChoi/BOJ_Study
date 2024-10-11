function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim();

  const lines = input.split("\n");
  const n = parseInt(lines[0]); 
  let ans = [];

  for (let i = 0; i < n; i++) {
    const word1 = lines[2 * i + 1]; 
    const word2 = lines[2 * i + 2]; 

    const cnt1 = Array(26).fill(0);
    const cnt2 = Array(26).fill(0);

    for (const c of word1) 
      cnt1[c.charCodeAt(0) - "a".charCodeAt(0)]++;
    for (const c of word2) {
      cnt2[c.charCodeAt(0) - "a".charCodeAt(0)]++;
    }

    let dist = 0;
    for (let j = 0; j < 26; j++) 
      dist += Math.abs(cnt1[j] - cnt2[j]);

    ans.push(`Case #${i + 1}: ${dist}`);
  }

  console.log(ans.join("\n"));
}

main();
