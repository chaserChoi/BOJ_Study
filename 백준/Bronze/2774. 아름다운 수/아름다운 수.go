package main

import (
	"fmt"
)

func beautifulDeg(x int) int {
	digit := make(map[rune]struct{})

	for x > 0 {
		d := x % 10
		digit[rune(d)] = struct{}{}
		x /= 10
	}

	return len(digit)
}

func main() {
	var t int
	fmt.Scan(&t)

	for i := 0; i < t; i++ {
		var x int
		fmt.Scan(&x)
		fmt.Println(beautifulDeg(x))
	}
}
