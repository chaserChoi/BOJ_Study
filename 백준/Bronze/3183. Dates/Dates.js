function isLeapYear(year) {
  if (year % 400 === 0) {
    return true;
  }
  if (year % 100 === 0) {
    return false;
  }
  return year % 4 === 0;
}

function isValidDate(day, month, year) {
  if (month < 1 || month > 12) {
    return false;
  }

  let daysInMonth = 31; 
  switch (month) {
    case 4:
    case 6:
    case 9:
    case 11:
      daysInMonth = 30;
      break;
    case 2:
      daysInMonth = isLeapYear(year) ? 29 : 28;
      break;
  }

  return day >= 1 && day <= daysInMonth;
}

function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  for (const line of input) {
    const [day, month, year] = line.split(" ").map(Number);

    if (day === 0 && month === 0 && year === 0) {
      break;
    }

    if (isValidDate(day, month, year)) {
      console.log("Valid");
    } else {
      console.log("Invalid");
    }
  }
}

main();
