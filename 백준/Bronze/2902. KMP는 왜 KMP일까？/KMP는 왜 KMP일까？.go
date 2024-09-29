package main

import (
	"fmt"
	"strings"
)

func main() {
	var name string
	fmt.Scan(&name)

	parts := strings.Split(name, "-")

	short := make([]rune, 0)

	short = append(short, rune(parts[0][0]))

	for _, part := range parts[1:] {
		short = append(short, rune(part[0]))
	}

	fmt.Println(string(short))
}
