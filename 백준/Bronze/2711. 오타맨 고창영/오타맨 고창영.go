package main

import (
	"fmt"
)

func main() {
	var t int
	fmt.Scan(&t)

	for i := 0; i < t; i++ {
		var pos int
		var s string
		fmt.Scan(&pos, &s)

		idx := pos - 1

		correct := s[:idx] + s[idx+1:]

		fmt.Println(correct)
	}
}
