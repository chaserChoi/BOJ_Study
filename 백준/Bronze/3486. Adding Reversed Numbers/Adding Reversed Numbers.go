package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func reverseString(s string) string {
	n := len(s)
	reversed := make([]byte, n)
	for i := 0; i < n; i++ {
		reversed[i] = s[n-i-1]
	}

	return strings.TrimLeft(string(reversed), "0")
}

func main() {
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)
	defer w.Flush()

	var n int
	fmt.Fscan(r, &n)

	for i := 0; i < n; i++ {
		var a, b string
		fmt.Fscan(r, &a, &b)

		reversedA := reverseString(a)
		reversedB := reverseString(b)

		numA, _ := strconv.Atoi(reversedA)
		numB, _ := strconv.Atoi(reversedB)
		sum := numA + numB

		reversedSum := reverseString(strconv.Itoa(sum))

		fmt.Fprintln(w, reversedSum)
	}
}
