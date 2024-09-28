package main

import (
	"fmt"
)

func main() {
	var str string
	fmt.Scan(&str)

	censored := ""
	set := map[rune]struct{}{
		'C': {}, 'A': {}, 'M': {}, 'B': {}, 'R': {},
		'I': {}, 'D': {}, 'G': {}, 'E': {},
	}

	for _, c := range str {
		if _, exists := set[c]; !exists {
			censored += string(c)
		}
	}

	fmt.Println(censored)
}
