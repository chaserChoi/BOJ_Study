package main

import (
	"fmt"
	"sort"
)

func main() {
	var nums [5]int
	sum := 0

	for i := 0; i < 5; i++ {
		fmt.Scan(&nums[i])
		sum += nums[i]
	}

	avg := sum / 5

	sort.Ints(nums[:])

	med := nums[2]

	fmt.Println(avg)
	fmt.Println(med)
}
