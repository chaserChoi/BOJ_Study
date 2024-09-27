package main

import (
	"fmt"
	"strconv"
)

func main() {
	var n int
	fmt.Scan(&n)

	for i := 0; i < n; i++ {
		var s string
		fmt.Scan(&s)

		a := make([]int, 3)

		for i := 0; i < 3; i++ {
			num, _ := strconv.Atoi(s[i*3 : i*3+2])
			a[i] = num
		}

		b := make([][]int, 3)
		for i := range b {
			b[i] = make([]int, 6)
			for j := 0; j < 6; j++ {
				b[i][j] = (a[i] >> (5 - j)) & 1
			}
		}

		for i := 0; i < 6; i++ {
			for j := 0; j < 3; j++ {
				fmt.Print(b[j][i])
			}
		}

		fmt.Print(" ")

		for i := 0; i < 3; i++ {
			for j := 0; j < 6; j++ {
				fmt.Print(b[i][j])
			}
		}
		fmt.Println()
	}
}
