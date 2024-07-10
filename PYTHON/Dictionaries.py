customer  = {
    "name" : "John Smith",
    "age": 30,
    # "age":40, no duplicates unique keys
    "is_verified": True
}

print(customer ["name"])
print(customer.get("name"))
print(customer.get("dob","1.2.2023"))
print(customer.get("address"))
customer["name"] = "Anusree"
print(customer.get("name"))
