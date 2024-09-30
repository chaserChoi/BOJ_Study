package main

import (
	"fmt"
)

func main() {
	nums := make([]int, 9)

	for i := 0; i < 9; i++ {
		fmt.Scan(&nums[i])
	}

	for i := 0; i < 9; i++ {
		for j := i + 1; j < 9; j++ {
			sum := 0
			for k := 0; k < 9; k++ {
				if k != i && k != j {
					sum += nums[k]
				}
			}

			if sum == 100 {
				for k := 0; k < 9; k++ {
					if k != i && k != j {
						fmt.Println(nums[k])
					}
				}
				return
			}
		}
	}
}
