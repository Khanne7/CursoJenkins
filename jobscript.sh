for a in {1..15}
do
        # si a es 8 entonces descansa
        if [ $a -eq 8 ]
        then
                echo "A descansar de clase $nombre"
                sleep 5
        fi
        echo "clase n $a"
done
sleep 5
echo "Bien $nombre, terminamos las clases $curso, nos vemos"
