package main

import (
	"fmt"
)

func main() {
	var n int
	fmt.Scan(&n)

	if n == 0 {
		fmt.Println(0)
		return
	} else if n == 1 {
		fmt.Println(1)
		return
	}

	a, b := 0, 1

	for i := 2; i <= n; i++ {
		fib := a + b
		a = b
		b = fib
	}

	fmt.Println(b)
}
