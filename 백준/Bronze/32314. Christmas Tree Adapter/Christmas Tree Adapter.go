package main

import (
	"fmt"
)

func main() {
	var a int
	var w, v int

	fmt.Scan(&a)
	fmt.Scan(&w, &v)

	adapter := w / v

	if adapter >= a {
		fmt.Println(1)
	} else {
		fmt.Println(0)
	}
}
