import "sort"

func solution(grid []string) []int {
	R := len(grid)
	C := len(grid[0])

	visited := make([][][]bool, R) // 3차원 방문 배열 
	for i := range visited {
		visited[i] = make([][]bool, C)
		for j := range visited[i] {
			visited[i][j] = make([]bool, 4)
		}
	}

    // 방향 
	dr := []int{-1, 0, 1, 0}
	dc := []int{0, 1, 0, -1}

	var answer []int

    // 완전 탐색 
	for r := 0; r < R; r++ {
		for c := 0; c < C; c++ {
			for d := 0; d < 4; d++ {
				if visited[r][c][d] { // 이미 다른 사이클에 의해 방문된 상태라면 
					continue
				}

				count := 0
				currR, currC, currD := r, c, d

                // 사이클 시뮬레이션 
				for !visited[currR][currC][currD] {
					visited[currR][currC][currD] = true
					count++

                    // 현재 방향으로 전진 
					currR = (currR + dr[currD] + R) % R
					currC = (currC + dc[currD] + C) % C

                    // 도착한 새 칸 문자에 따라 다음 방향 결정 
					node := grid[currR][currC]
					if node == 'L' {
						currD = (currD + 3) % 4
					} else if node == 'R' {
						currD = (currD + 1) % 4
					}
				}

				answer = append(answer, count)
			}
		}
	}

	sort.Ints(answer)

	return answer
}