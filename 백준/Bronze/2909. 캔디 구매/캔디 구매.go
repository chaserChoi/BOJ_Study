package main

import (
	"fmt"
)

func main() {
	var c, k int
	fmt.Scan(&c, &k)

	deno := 1
	for i := 0; i < k; i++ {
		deno *= 10
	}

	roundedPrice := (c + deno/2) / deno * deno

	fmt.Println(roundedPrice)
}
