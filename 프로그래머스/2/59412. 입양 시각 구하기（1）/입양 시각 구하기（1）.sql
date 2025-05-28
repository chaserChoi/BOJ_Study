SELECT date_format(DATETIME, '%H') HOUR, count(*) COUNT
FROM ANIMAL_OUTS 
WHERE date_format(DATETIME, '%H:%i') >= '09:00' AND date_format(DATETIME, '%H:%i') <= '19:59' 
GROUP BY HOUR
ORDER BY HOUR;