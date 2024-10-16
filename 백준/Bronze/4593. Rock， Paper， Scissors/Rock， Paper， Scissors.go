package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)
	defer w.Flush()

	for {
		p1, _ := r.ReadString('\n')
		p1 = p1[:len(p1)-1]

		p2, _ := r.ReadString('\n')
		p2 = p2[:len(p2)-1]

		if p1 == "E" && p2 == "E" {
			break
		}

		p1Score, p2Score := 0, 0
		l := len(p1)

		for i := 0; i < l; i++ {
			if p1[i] == p2[i] {
				continue
			}

			switch p1[i] {
			case 'R':
				if p2[i] == 'S' {
					p1Score++
				} else {
					p2Score++
				}
			case 'P':
				if p2[i] == 'R' {
					p1Score++
				} else {
					p2Score++
				}
			case 'S':
				if p2[i] == 'P' {
					p1Score++
				} else {
					p2Score++
				}
			}
		}

		fmt.Fprintf(w, "P1: %d\n", p1Score)
		fmt.Fprintf(w, "P2: %d\n", p2Score)
	}
}
