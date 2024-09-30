package main

import (
	"fmt"
)

func main() {
	var a, b, c int
	fmt.Scan(&a, &b, &c)

	parked := make([]int, 101)

	for i := 0; i < 3; i++ {
		var arrive, depart int
		fmt.Scan(&arrive, &depart)
		for j := arrive; j < depart; j++ {
			parked[j]++
		}
	}

	total := 0
	for _, cnt := range parked {
		switch cnt {
		case 1:
			total += a
		case 2:
			total += b * 2
		case 3:
			total += c * 3
		}
	}

	fmt.Println(total)
}
