package main

import (
	"fmt"
	"math"
)

func main() {
	var n string
	var b int
	fmt.Scan(&n, &b)

	decimal := 0

	for i, char := range n {
		var val int
		if char >= '0' && char <= '9' {
			val = int(char - '0')
		} else {
			val = int(char - 'A' + 10)
		}

		decimal += val * int(math.Pow(float64(b), float64(len(n)-1-i)))
	}

	fmt.Println(decimal)
}
