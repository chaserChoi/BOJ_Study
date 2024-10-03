function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  let ans = [];

  for (let i = 0; i < input.length; i += 2) {
    const k = input[i].trim();
    if (k === "0") break;
    const plain = input[i + 1].trim();

    const cipher = encryptVigenere(plain, k);
    ans.push(cipher);
  }

  console.log(ans.join("\n"));
}

function encryptVigenere(plain, k) {
  let cipher = '';
  const kLen = k.length;

  for (let i = 0; i < plain.length; i++) {
    const pChar = plain[i];
    const kChar = k[i % kLen];

    const pIdx = pChar.charCodeAt(0) - 'A'.charCodeAt(0);
    const kIdx = kChar.charCodeAt(0) - 'A'.charCodeAt(0);

    const cIdx = (pIdx + kIdx + 1) % 26;
    const cChar = String.fromCharCode(cIdx + 'A'.charCodeAt(0));

    cipher += cChar;
  }

  return cipher;
}

main();
