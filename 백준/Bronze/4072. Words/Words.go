package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main() {
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)
	defer w.Flush()

	for {
		s, _ := r.ReadString('\n')
		s = strings.TrimSpace(s)
		if s == "#" {
			break
		}

		words := strings.Split(s, " ")
		for _, word := range words {
			reversed := reverse(word)
			fmt.Fprint(w, reversed+" ")
		}
		fmt.Fprintln(w)
	}
}

func reverse(s string) string {
	runes := []rune(s)
	for i, j := 0, len(runes)-1; i < j; i, j = i+1, j-1 {
		runes[i], runes[j] = runes[j], runes[i]
	}
	return string(runes)
}
