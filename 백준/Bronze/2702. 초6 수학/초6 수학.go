package main

import (
	"fmt"
)

func gcd(a, b int) int {
	for b != 0 {
		a, b = b, a%b
	}
	return a
}

func lcm(a, b int) int {
	return (a * b) / gcd(a, b)
}

func main() {
	var t int
	fmt.Scan(&t)

	for i := 0; i < t; i++ {
		var a, b int
		fmt.Scan(&a, &b)

		lcmVal := lcm(a, b)
		gcdVal := gcd(a, b)

		fmt.Println(lcmVal, gcdVal)
	}
}
