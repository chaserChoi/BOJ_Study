package main

import (
	"fmt"
)

func main() {
	var moves string
	fmt.Scan(&moves)

	pos := 1

	for _, move := range moves {
		switch move {
		case 'A':
			if pos == 1 {
				pos = 2
			} else if pos == 2 {
				pos = 1
			}
		case 'B':
			if pos == 2 {
				pos = 3
			} else if pos == 3 {
				pos = 2
			}
		case 'C':
			if pos == 1 {
				pos = 3
			} else if pos == 3 {
				pos = 1
			}
		}
	}

	fmt.Println(pos)
}
