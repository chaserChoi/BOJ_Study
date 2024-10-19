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
		packet, _ := r.ReadString('\n')
		packet = packet[:len(packet)-1]

		if packet == "#" {
			break
		}

		quicksum := 0

		for i, c := range packet {
			position := i + 1
			if c >= 'A' && c <= 'Z' {
				val := int(c - 'A' + 1)
				quicksum += position * val
			} else if c == ' ' {
				continue
			}
		}

		fmt.Fprintln(w, quicksum)
	}
}
