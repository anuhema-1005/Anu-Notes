phone = input("Phone: ")
digits_mapping = {
    "1" : "One ",
    "2": "Two ",
    "3" : "Three ",
    "4" : "Four"
}
output =""
for ch in phone:
    output+= digits_mapping.get(ch,"-1")
print(output)

message = input("> ")
words = message.split(' ')
emojis = {
    ":)" : "😄",
    ":(" : "🤮"
}
Output = ""
for s in words:
    Output += emojis.get(s,s)+" "
print(Output)


