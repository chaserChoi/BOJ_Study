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
		line, _ := r.ReadString('\n')
		line = strings.TrimSpace(line)
		if line == "#" {
			break
		}

		words := strings.Split(line, " ")

		fir, sec, thir := words[0], words[1], words[2]

		ans := make([]byte, len(fir))
		for i := 0; i < len(fir); i++ {
			diff := (sec[i] - fir[i] + 26) % 26
			ans[i] = (thir[i]-'a'+diff+26)%26 + 'a'
		}

		fmt.Fprintf(w, "%s %s %s %s\n", fir, sec, thir, string(ans))
	}
}
