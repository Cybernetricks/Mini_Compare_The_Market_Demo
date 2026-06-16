const BASE_URL = "http://localhost:8080";

export async function getQuotes(request) {
  const response = await fetch(`${BASE_URL}/api/quotes`, {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify(request)
  });

  if (!response.ok) {
    throw new Error("Failed to fetch quotes");
  }

  return response.json();
}