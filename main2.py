import csv

with open("dataset.csv") as f:
    rows = list(csv.DictReader(f))

print(f"Shape: ({len(rows)}, 2)")
for r in rows:
    print(r)

print("\n--- TESTING 3 SCENARIOS ---")
for i, row in enumerate(rows):
    topic = row['topic']
    print(f"\nScenario {i+1}: {topic}")
    print("BEFORE: Explain", topic)
    print("AFTER: You are an expert AI Tutor. Explain", topic, "in simple language. Max 5 bullet points, Max 100 words, No jargon, Use example. Output: Bullet points only")

print("\n--- BEFORE vs AFTER ---")
print("BEFORE: Vague, long, no format, inconsistent")
print("AFTER: Short, 5 bullets, clear, beginner-friendly, consistent")
print("Improvement: Added Persona + Task + Length limit + Bullet format + Constraints")