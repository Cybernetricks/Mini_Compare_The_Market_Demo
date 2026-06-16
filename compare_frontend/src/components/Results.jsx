import QuoteCard from "./QuoteCard";

export default function Results({ quotes }) {
  if (!quotes.length) return null;

  return (
    <div>
      <h2>Compare Your Quotes</h2>

      {quotes
        .sort((a, b) => a.price - b.price)
        .map((quote, index) => (
          <QuoteCard key={index} quote={quote} />
        ))}
    </div>
  );
}